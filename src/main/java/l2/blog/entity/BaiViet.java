package l2.blog.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "baiviet")
public class BaiViet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String tieude;
	private String noidung;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date ngaytao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
	private Date ngaysua;
	private String avatar;
	private long soview;
	@ManyToOne
	@JoinColumn(name = "nguoitao")
	@JsonBackReference
	private TaiKhoan nguoiTao;
	
	@ManyToOne
	@JoinColumn(name = "menu")
	
	private Menu menu;

	@ManyToMany(mappedBy = "listBaiVietDaLike")
	private List<TaiKhoan> listTaiKhoanLike;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public Date getNgaytao() {
		return ngaytao;
	}

	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}

	public Date getNgaysua() {
		return ngaysua;
	}

	public void setNgaysua(Date ngaysua) {
		this.ngaysua = ngaysua;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public long getSoview() {
		return soview;
	}

	public void setSoview(long soview) {
		this.soview = soview;
	}

	public TaiKhoan getNguoiTao() {
		return nguoiTao;
	}

	public void setNguoiTao(TaiKhoan nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<TaiKhoan> getListTaiKhoanLike() {
		return listTaiKhoanLike;
	}

	public void setListTaiKhoanLike(List<TaiKhoan> listTaiKhoanLike) {
		this.listTaiKhoanLike = listTaiKhoanLike;
	}

}
