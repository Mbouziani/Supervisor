package com.example.asuper;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class room extends Fragment {


    GridView listrow;
    String [] id = {"1","2","3","4","5","6","7","8","9","10"};
    String [] Palyer = {"20","35","43","04","49","19","15","42","46","22"};
    String [] Time = {"21:51","16:11","11:10","20:20","14:50","09:51","15:22","14:32","18:46","22:15"};
    ImageButton room_add;
    RadioButton rd_all;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //assigner le view
        View myView = inflater.inflate(R.layout.fragment_room, container, false);
        rd_all = (RadioButton)myView.findViewById(R.id.rd_all) ;
        rd_all.setChecked(true);
        //remplir la list room
        listrow = (GridView)myView.findViewById(R.id.list_room) ;
        myadapter md = new myadapter();
        listrow.setAdapter(md);

        // add_button event
         room_add = (ImageButton)myView.findViewById(R.id.room_add) ;

         room_add.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                View myView = inflater.inflate(R.layout.fragment_room, container, false);

                add_room fr = new add_room ();

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_fram,fr).commit();

                 Toast.makeText(getContext(),"rome ici" , Toast.LENGTH_LONG).show();
             }
         });










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
            view = getLayoutInflater().inflate(R.layout.room_row,null);
            TextView id_room  = (TextView)view.findViewById(R.id.id_room);
            TextView player_room  = (TextView)view.findViewById(R.id.player_room);
            TextView time_room  = (TextView)view.findViewById(R.id.time_room);
            id_room.setText(id[i].toString());
            player_room.setText(Palyer[i].toString());
            time_room.setText(Time[i].toString());


            return view;
        }
    }




}