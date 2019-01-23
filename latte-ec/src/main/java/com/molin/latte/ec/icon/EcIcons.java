package com.molin.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by Molin on 2019/1/23.
 */

public enum EcIcons implements Icon {
    icon_test('\ue6a7'),
    icon_text('\ue612');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
