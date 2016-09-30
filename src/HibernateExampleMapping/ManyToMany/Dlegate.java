package HibernateExampleMapping.ManyToMany;

import org.hibernate.annotations.Cache;

import javax.persistence.*;
import java.util.List;

/**
 * Created by rakeshgupta on 9/4/16.
 */
@Entity
@Table(name = "Dlegate_ManyToMany")
public class Dlegate {
    @Column
    @Id
    private int dId;

    @Column
    private String dName;


    @ManyToMany
    @JoinTable(name = "Host_Manager",joinColumns = {@JoinColumn(name="eventId")},
    inverseJoinColumns = {@JoinColumn(name="dId")})
    private List<Event> event;

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }
}
