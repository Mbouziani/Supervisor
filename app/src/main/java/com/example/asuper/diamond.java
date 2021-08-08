package com.example.asuper;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class diamond extends Fragment {
    GridView list_diamond;
    String [] id = {"1","2","3","4","5","6","7","8","9","10"};
    String [] Diamond = {"20","35","43","04","49","19","15","42","46","22"};
    String [] code = {"2151","1611","1110","2020","1450","0951","1522","1432","1846","2915"};



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_diamond, container, false);
        // Inflate the layout for this fragment
         //remplir la list room
        list_diamond = (GridView)myView.findViewById(R.id.list_diamond) ;
        myadapter md = new myadapter();
        list_diamond.setAdapter(md);
        return myView;
    }
    class myadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return id.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int i, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.diamond_row,null);
            TextView id_room  = (TextView)view.findViewById(R.id.id_room);
            TextView player_room  = (TextView)view.findViewById(R.id.player_room);
            TextView time_room  = (TextView)view.findViewById(R.id.time_room);
            id_room.setText(id[i].toString());
            player_room.setText(Diamond[i].toString());
            time_room.setText(code[i].toString());


            return view;
        }
    }

}