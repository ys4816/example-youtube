package youtube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

 @RestController
 public class ChannelSystemController {


@RequestMapping(value = "/&#x2F;editChannel",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8")

public void editChannel(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        System.out.println("##### /channelSystem/editChannel  called #####");
        }

 }
