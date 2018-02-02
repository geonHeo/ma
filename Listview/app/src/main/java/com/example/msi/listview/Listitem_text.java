package com.example.msi.listview;

import android.graphics.drawable.Drawable;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by MSI on 2018-01-31.
 */

public class Listitem_text {

    private ArrayList<String> list;
    private Drawable mIcon;
    private boolean mSelectable = true;
    private ArrayAdapter<String> adapter;
    public Listitem_text(Drawable icon, ArrayList<String> obj){
        mIcon = icon;
        list = obj;
    }

    public boolean isSelectable(){
        return mSelectable;
    }

    public void setSelectable(boolean selectable){
        mSelectable = selectable;
    }

    public ArrayList<String> getData(){
        return list;
    }

    public String getData(int index){
        if(list == null){
            return null;
        }
        return list<index>;
    }

    public void setData(ArrayList<String> obj){
        list = obj;
    }

    public void seticon(Drawable icon){
        mIcon = icon;
    }

    public Drawable getIcon(){
        return mIcon;
    }



}
