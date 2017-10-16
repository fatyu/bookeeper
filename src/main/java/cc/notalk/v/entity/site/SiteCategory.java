package cc.notalk.v.entity.site;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cc.notalk.v.entity.BaseEntity;

@Entity
@Table(name = "v_site_category")
public class SiteCategory extends BaseEntity {

	private static final long serialVersionUID = 8867043020340699653L;
	private String name;
	private Long pid;

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "pid")
	public Long getPId() {
		return pid;
	}

	public void setPId(Long pid) {
		this.pid = pid;
	}

}