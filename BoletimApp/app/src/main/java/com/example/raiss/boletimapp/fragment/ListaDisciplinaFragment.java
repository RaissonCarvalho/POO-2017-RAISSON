package com.example.raiss.boletimapp.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raiss.boletimapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaDisciplinaFragment extends Fragment {


    public ListaDisciplinaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lista_disciplina, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_lista_disciplina);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

}
