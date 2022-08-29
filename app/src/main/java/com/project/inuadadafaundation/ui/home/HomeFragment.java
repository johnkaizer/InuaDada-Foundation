package com.project.inuadadafaundation.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.project.inuadadafaundation.Adapters.ProgramsAdapter;
import com.project.inuadadafaundation.Adapters.WhatsNewAdapter;
import com.project.inuadadafaundation.Models.ProgramsModel;
import com.project.inuadadafaundation.Models.WhatsNewModel;
import com.project.inuadadafaundation.R;
import com.project.inuadadafaundation.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    // WhatsNew
    RecyclerView whatsNewRec;
    ArrayList<WhatsNewModel> whatsNewModelList;
    WhatsNewAdapter whatsNewAdapter;

    //Programs
    RecyclerView programsRec;
    ArrayList<ProgramsModel> programsModelList;
    ProgramsAdapter programsAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        /////////////////WhatsNew/////////////////////

        whatsNewRec =root.findViewById(R.id.recyclerview_whatsNew);
        whatsNewModelList =new ArrayList<>();

        whatsNewModelList.add(new WhatsNewModel("SEPTEMBER 3, 2022",R.drawable.whatsnew1,"Inua Dada Kibera","This is dummy data"));
        whatsNewModelList.add(new WhatsNewModel("SEPTEMBER 10, 2022",R.drawable.whatsnew2,"Inua Dada Kibera","This is dummy data"));
        whatsNewModelList.add(new WhatsNewModel("SEPTEMBER 20, 2022",R.drawable.whatsnew3,"Inua Dada Kibera","This is dummy data"));
        whatsNewModelList.add(new WhatsNewModel("OCTOBER 12, 2022",R.drawable.whatsnew1,"Inua Dada Kibera","This is dummy data"));
        whatsNewModelList.add(new WhatsNewModel("OCTOBER 23, 2022",R.drawable.whatsnew2,"Inua Dada Kibera","This is dummy data"));
        whatsNewModelList.add(new WhatsNewModel("NOVEMBER 3, 2022",R.drawable.whatsnew3,"Inua Dada Kibera","This is dummy data"));

        whatsNewAdapter = new WhatsNewAdapter(getActivity(), whatsNewModelList, this);
        whatsNewRec.setAdapter(whatsNewAdapter);
        whatsNewRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));
        whatsNewRec.setHasFixedSize(true);
        whatsNewRec.setNestedScrollingEnabled(false);

        /////////////////Programs////////////////////////////

        programsRec =root.findViewById(R.id.programs_recyclerview);
        programsModelList =new ArrayList<>();

        programsModelList.add(new ProgramsModel(R.drawable.whatsnew1,"Header1","Information 1"));
        programsModelList.add(new ProgramsModel(R.drawable.whatsnew1,"Header1","Information 1"));
        programsModelList.add(new ProgramsModel(R.drawable.whatsnew1,"Header1","Information 1"));
        programsModelList.add(new ProgramsModel(R.drawable.whatsnew1,"Header1","Information 1"));
        programsModelList.add(new ProgramsModel(R.drawable.whatsnew1,"Header1","Information 1"));
        programsModelList.add(new ProgramsModel(R.drawable.whatsnew1,"Header1","Information 1"));

        programsAdapter = new ProgramsAdapter(getActivity(), programsModelList, this);
        programsRec.setAdapter(programsAdapter);
        programsRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, false));
        programsRec.setHasFixedSize(true);
        programsRec.setNestedScrollingEnabled(false);

        return root;
    }
}