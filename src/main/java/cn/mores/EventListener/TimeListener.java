package cn.mores.EventListener;

import cn.mores.UI.SelectUI;
import snw.jkook.entity.User;
import snw.jkook.event.EventHandler;
import snw.jkook.event.Listener;
import snw.jkook.event.user.UserJoinGuildEvent;

public class TimeListener implements Listener {

    @EventHandler
    public void onUserJoin(UserJoinGuildEvent event) {
        User user = event.getUser();
        user.sendPrivateMessage(SelectUI.CreateCardComponent());
    }
}
