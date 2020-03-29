package com.ai.faraday;

import android.widget.TextView;

public class SettingUp
{
    private MainActivity main;
    private String Name;
    TextView display;


    public MainActivity getMain() {

        return main;
    }

    public void setMain(MainActivity main) {
        this.main = main;
    }


    public String getName() {
        return Name;
    }


    public void setName(String name)
    {
        Name = name;
    }

    public TextView getDisplay() {
        return display;
    }

    public void setDisplay(TextView display) {
        this.display = display;
    }


}
