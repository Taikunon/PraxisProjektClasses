package gcmClasses;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement

public class Game  implements Serializable{

	private static final long serialVersionUID = 1L;


	private int id;

	private String gameTitle;


	private LocalDate releaseDate;

	// join table genre games

	List<Genre> genres = new ArrayList<Genre>();

	
	

	Set<Member> members = new HashSet<>();
	
	
		

    List<Tournament> tournaments = new ArrayList<Tournament>();
	
	
	private String gameAdditionalNotes;



	public Game() {
		super();
	}



	public Game(String gameTitle, LocalDate releaseDate, List<Genre> genres, Set<Member> members,
			List<Tournament> tournaments, String gameAdditionalNotes) {
		super();
		this.gameTitle = gameTitle;
		this.releaseDate = releaseDate;
		this.genres = genres;
		this.members = members;
		this.tournaments = tournaments;
		this.gameAdditionalNotes = gameAdditionalNotes;
	}


	@XmlElement(name="GameTitle")
	public String getGameTitle() {
		return gameTitle;
	}



	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}


	@XmlJavaTypeAdapter(value= LocalDateAdapter.class)
	@XmlElement(name="ReleaseDate")
	public LocalDate getReleaseDate() {
		return releaseDate;
	}



	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}


	@XmlElement(name="Genres")
	public List<Genre> getGenres() {
		return genres;
	}



	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}


	@XmlElement(name="Members")
	public Set<Member> getMembers() {
		return members;
	}



	public void setMembers(Set<Member> members) {
		this.members = members;
	}


	@XmlElement(name="Tournaments")
	public List<Tournament> getTournaments() {
		return tournaments;
	}



	public void setTournaments(List<Tournament> tournaments) {
		this.tournaments = tournaments;
	}


	@XmlElement(name="GameAdditionalNotes")
	public String getGameAdditionalNotes() {
		return gameAdditionalNotes;
	}



	public void setGameAdditionalNotes(String gameAdditionalNotes) {
		this.gameAdditionalNotes = gameAdditionalNotes;
	}


	@XmlElement(name="ID",required=true)
	public int getId() {
		return id;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "\nGame id=" + id 
				+ "\ngameTitle=" + gameTitle 
				+ "\nreleaseDate=" + releaseDate 
				+ "\ngameAdditionalNotes="	+ getGameAdditionalNotes()
				+ "\n----------------------------------"
				+ "\n";
	}
	
	


	
}