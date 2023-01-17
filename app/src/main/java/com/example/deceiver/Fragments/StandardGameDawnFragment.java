package com.example.deceiver.Fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.deceiver.Activities.StandardGameActivity;
import com.example.deceiver.DataClasses.StandardCharacter;
import com.example.deceiver.Enums.Phase;
import com.example.deceiver.Enums.StandardRole;
import com.example.deceiver.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StandardGameDawnFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StandardGameDawnFragment extends Fragment {

    View objectStandardGameDawnFragment;
    private ImageView c1,c2,c3,c4,c5,c6,c7,c8,c1dead,c2dead,c3dead,c4dead,c5dead,c6dead,c7dead,c8dead,c1role,c2role,c3role,c4role,c5role,c6role,c7role,c8role,nextPhase;
    ArrayList<StandardCharacter> order;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public StandardGameDawnFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GameDawnFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StandardGameDawnFragment newInstance(String param1, String param2) {
        StandardGameDawnFragment fragment = new StandardGameDawnFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        objectStandardGameDawnFragment=inflater.inflate(R.layout.fragment_game_dawn,container,false);
        attachComponents();

        return objectStandardGameDawnFragment;
    }

    public void attachComponents(){
        c1=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar1);
        c2=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar2);
        c3=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar3);
        c4=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar4);
        c5=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar5);
        c6=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar6);
        c7=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar7);
        c8=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar8);

        c1dead=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar1Dead);
        c2dead=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar2Dead);
        c3dead=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar3Dead);
        c4dead=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar4Dead);
        c5dead=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar5Dead);
        c6dead=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar6Dead);
        c7dead=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar7Dead);
        c8dead=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar8Dead);

        c1role=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar1Role);
        c2role=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar2Role);
        c3role=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar3Role);
        c4role=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar4Role);
        c5role=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar5Role);
        c6role=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar6Role);
        c7role=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar7Role);
        c8role=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnChar8Role);

        nextPhase=objectStandardGameDawnFragment.findViewById(R.id.imgGameDawnNextPhase);

        nextPhase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StandardGameDawnLogFragment standardGameDawnLogFragment=new StandardGameDawnLogFragment();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.frameLayoutGame,standardGameDawnLogFragment,standardGameDawnLogFragment.getTag())
                        .commit();
            }
        });
    }
}