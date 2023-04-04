package cn.mores.UI;

import snw.jkook.message.component.card.*;
import snw.jkook.message.component.card.element.PlainTextElement;
import snw.jkook.message.component.card.module.CountdownModule;
import snw.jkook.message.component.card.module.HeaderModule;
import snw.jkook.message.component.card.module.SectionModule;

import java.util.concurrent.TimeUnit;

import static cn.mores.Anti.RandomCalculation.getFormula;

public class SelectUI {

    public MultipleCardComponent CreateCardComponent(){
        long now =System.currentTimeMillis();
        long endTime = now+ TimeUnit.SECONDS.toMillis(30);
        MultipleCardComponent cardComponent = new CardBuilder()
                .setTheme(Theme.SECONDARY)
                .setSize(Size.MD)
                .addModule(new HeaderModule(new PlainTextElement("请给出以下算式的值："+ getFormula(),false)))
                .addModule(new SectionModule(new PlainTextElement("请注意在三十秒内给出准确的回答否则将会被踢出频道"),null,null))
                .addModule(new CountdownModule(CountdownModule.Type.SECOND,endTime))
                .build();
        return cardComponent;
    }
}
