package edu.dtcc.spaol1.phrasedatabaseproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Sean on 4/18/2017.
 */

public class Adapter extends ArrayAdapter<Item>
{
    private Activity activity;
    int id;
    ArrayList<Item> item;


    public Adapter(Activity context, int resource, ArrayList<Item> objects)
    {
        super(context, resource, objects);
        this.activity = context;
        this.id = resource;
        this.item = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(id, null);
        }
        return super.getView(position, convertView, parent);
    }
}
