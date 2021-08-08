package com.example.asuper;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class admin extends Fragment {
    GridView list_diamond;
    String [] CIN = {"F4551","F3451","F3264","F4651","F349","F5121","F7251","F7751","F8751","F8651"};
    String [] Nom = {"Kairedin","Mohammed","Saad","Mansour","Ali","Anas","Houda","Ikram","Fatima","chi kalb"};
    String [] MontantTtl = {"2151","1611","1110","2020","1450","0951","1522","1432","1846","2915"};
    String [] Mantant  = {"100","221","534","544","445","654","170","80","945","232"};
    String [] Frait = {"20","35","43","04","49","19","15","42","46","22"};
    String [] Etat = {"Envoyé","EnAttente","Envoyé","Envoyé","EnAttente","EnAttente","EnAttente","Envoyé","Envoyé","EnAttente"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View myView = inflater.inflate(R.layout.fragment_admin, container, false);
        // Inflate the layout for this fragment
         //remplir la list room
        list_diamond = (GridView)myView.findViewById(R.id.list_payment) ;
        myadapter md = new myadapter();
        list_diamond.setAdapter(md);
        return myView;
    }
    class myadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return CIN.length;
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
            view = getLayoutInflater().inflate(R.layout.payment_row,null);
            TextView CIN_text  = (TextView)view.findViewById(R.id.CIN_text);
            TextView montant_text  = (TextView)view.findViewById(R.id.montant_text);
            TextView Nom_text  = (TextView)view.findViewById(R.id.Nom_text);
            TextView MantantTTL_text  = (TextView)view.findViewById(R.id.MantantTTL_text);
            TextView Frait_text  = (TextView)view.findViewById(R.id.Frait_text);
            TextView etat_text  = (TextView)view.findViewById(R.id.etat_text);

            CIN_text.setText(CIN[i].toString());
            montant_text.setText(Mantant[i].toString()+" Dh");
            Nom_text.setText(Nom[i].toString());
            MantantTTL_text.setText(MontantTtl[i].toString()+" Dh");
            Frait_text.setText(Frait[i].toString()+" %");
            etat_text.setText(Etat[i].toString());


            return view;
        }
    }
}