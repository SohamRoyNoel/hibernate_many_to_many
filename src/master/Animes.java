package master;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Animes {
	
	@Id
	@Column(length=3)
	int anime_id;
	@Column(length=20)
	String anime_name;
	
	@ManyToMany
	@JoinTable(
				name="Anime_otaku",
				joinColumns=@JoinColumn(name="anime_id"),
				inverseJoinColumns=@JoinColumn(name="otaku_id")
			)
	
	List<Otakus> otakus =  new ArrayList<>();
	
	public List<Otakus> getOtakus() {
		return otakus;
	}
	public void setOtakus(List<Otakus> otakus) {
		this.otakus = otakus;
	}
	
	
	public int getAnime_id() {
		return anime_id;
	}
	public void setAnime_id(int anime_id) {
		this.anime_id = anime_id;
	}
	public String getAnime_name() {
		return anime_name;
	}
	public void setAnime_name(String anime_name) {
		this.anime_name = anime_name;
	}
	
	
}
