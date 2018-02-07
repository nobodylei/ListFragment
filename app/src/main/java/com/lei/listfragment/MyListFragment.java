package com.lei.listfragment;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanle on 2018/2/7.
 */

public class MyListFragment extends ListFragment{

    private List<String> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,null);
        list = new ArrayList<String>();
        for(int i = 0;i < 20;i ++) {
            list.add("item" + i);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,list);
        setListAdapter(adapter);
        return view;
    }

    /*
    为listview绑定每一项的点击事件
     */
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getActivity(),list.get(position)+"被点击了",Toast.LENGTH_SHORT).show();

    }
}
