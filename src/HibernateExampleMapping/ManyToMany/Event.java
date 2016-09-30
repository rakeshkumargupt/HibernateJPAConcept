package HibernateExampleMapping.ManyToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rakeshgupta on 9/4/16.
 */
@Entity
@Table(name = "Event_ManyToMany")
public class Event {

    @Column
    @Id
    private int eventId;

    @Column
    private String eventName;

    @ManyToMany
    @JoinTable(name = "Host_Manager",joinColumns = {@JoinColumn(name = "dId")},
    inverseJoinColumns = {@JoinColumn(name="eventId")})
    private List<Dlegate> list= new ArrayList<Dlegate>();

    public List<Dlegate> getList() {
        return list;
    }

    public void setList(List<Dlegate> list) {
        this.list = list;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
