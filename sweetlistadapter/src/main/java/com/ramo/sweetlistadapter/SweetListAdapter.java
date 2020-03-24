package com.ramo.sweetlistadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SweetListAdapter<T> extends ArrayAdapter<T> {

    private Context context;
    private List<T> list;
    private int resourceId;
    private ISweetSetItemView iSweetSetItemView;


    public SweetListAdapter(@NonNull Context context, int resource, @NonNull List<T> list) {
        super(context, resource, list);
        this.context = context;
        this.resourceId = resource;
        this.list = list;
    }

    public void setItemView(ISweetSetItemView<T> iSweetSetItemView)
    {
        this.iSweetSetItemView = iSweetSetItemView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(resourceId, parent, false);

        iSweetSetItemView.setItemView(convertView, list.get(position));

        return convertView;
    }
}