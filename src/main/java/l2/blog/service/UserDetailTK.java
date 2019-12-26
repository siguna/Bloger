package l2.blog.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import l2.blog.crud.TaiKhoanCrud;
import l2.blog.entity.TaiKhoan;

@Service
public class UserDetailTK implements UserDetailsService {

	@Autowired
	TaiKhoanCrud taiKhoanCrud;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		TaiKhoan taiKhoan = taiKhoanCrud.findByTendangnhap(username);
		if (taiKhoan == null) {
			throw new UsernameNotFoundException("khong tim thay ten dang nhap!!");
		}

		// set quyen
		Set<GrantedAuthority> listQuyen = new HashSet<>();
		if (taiKhoan.isAdmin() == true) {
			listQuyen.add(new SimpleGrantedAuthority("ROLE_Admin"));
		} else if (taiKhoan.isAdmin() == false) {
			listQuyen.add(new SimpleGrantedAuthority("ROLE_NguoiDung"));
		}

		return new User(taiKhoan.getTendangnhap(), taiKhoan.getMatkhau(), listQuyen);
	}

}
