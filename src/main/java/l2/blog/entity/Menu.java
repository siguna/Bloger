package l2.blog.entity;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String tenhienthi;
	private Date ngaytao;
	private Date ngaysua;
	@OneToMany(mappedBy = "menu")
	private List<BaiViet> listBaiViet;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTenhienthi() {
		return tenhienthi;
	}

	public void setTenhienthi(String tenhienthi) {
		this.tenhienthi = tenhienthi;
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

	public List<BaiViet> getListBaiViet() {
		return listBaiViet;
	}

	public void setListBaiViet(List<BaiViet> listBaiViet) {
		this.listBaiViet = listBaiViet;
	}

}
