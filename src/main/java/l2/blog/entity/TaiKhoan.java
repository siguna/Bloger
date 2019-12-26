package l2.blog.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity(name = "taikhoan")
public class TaiKhoan {

	@Id
	private String tendangnhap;
	private String matkhau;
	private boolean admin;
	private Date ngaytao;
	private Date ngaysua;
	@OneToMany(mappedBy = "taikhoan")
	private List<Comment> listComment;
	@OneToMany(mappedBy = "nguoiTao")
	private List<BaiViet> listBaiViet;
	@ManyToMany
	@JoinTable(name = "likes",
		joinColumns = @JoinColumn(name="taikhoan"),
		inverseJoinColumns = @JoinColumn(name="baiviet")
			)
	private List<BaiViet> listBaiVietDaLike;
	public String getTendangnhap() {
		return tendangnhap;
	}
	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
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
	public List<Comment> getListComment() {
		return listComment;
	}
	public void setListComment(List<Comment> listComment) {
		this.listComment = listComment;
	}
	public List<BaiViet> getListBaiViet() {
		return listBaiViet;
	}
	public void setListBaiViet(List<BaiViet> listBaiViet) {
		this.listBaiViet = listBaiViet;
	}
	public List<BaiViet> getListBaiVietDaLike() {
		return listBaiVietDaLike;
	}
	public void setListBaiVietDaLike(List<BaiViet> listBaiVietDaLike) {
		this.listBaiVietDaLike = listBaiVietDaLike;
	}

	
}
