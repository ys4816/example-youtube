package youtube;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="ChannelSystem_table")
public class ChannelSystem {

    private String channelName;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String channelId;
    private String clientId;
    private String videoId;

    @PrePersist
    public void onPrePersist(){
        CreatedChannel createdChannel = new CreatedChannel();
        BeanUtils.copyProperties(this, createdChannel);
        createdChannel.publishAfterCommit();


        EditedChannel editedChannel = new EditedChannel();
        BeanUtils.copyProperties(this, editedChannel);
        editedChannel.publishAfterCommit();


        DeletedChannel deletedChannel = new DeletedChannel();
        BeanUtils.copyProperties(this, deletedChannel);
        deletedChannel.publishAfterCommit();


    }


    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }




}
