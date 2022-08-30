package com.project.inuadadafaundation.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.PagerAdapter;

import com.project.inuadadafaundation.Adapters.ProgramsAdapter;
import com.project.inuadadafaundation.Adapters.WhatsNewAdapter;
import com.project.inuadadafaundation.Models.ProgramsModel;
import com.project.inuadadafaundation.Models.WhatsNewModel;
import com.project.inuadadafaundation.R;
import com.project.inuadadafaundation.databinding.FragmentGalleryBinding;
import com.project.inuadadafaundation.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {

    // WhatsNew
    RecyclerView whatsNewRec;
    ArrayList<WhatsNewModel> whatsNewModelList;
    WhatsNewAdapter whatsNewAdapter;
    LinearLayoutManager layoutManager;

    //Programs
    RecyclerView programsRec;
    ArrayList<ProgramsModel> programsModelList;
    ProgramsAdapter programsAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        ViewBinding binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /////////////////WhatsNew/////////////////////

        whatsNewRec =root.findViewById(R.id.recyclerview_whatsNew);
        whatsNewModelList =new ArrayList<>();

        whatsNewModelList.add(new WhatsNewModel("NOVEMBER 10, 2021",R.drawable.whatsnew1,"The Inua Dada Centre Launch",R.string.WhatsNew1));
        whatsNewModelList.add(new WhatsNewModel("SEPTEMBER 3, 2021",R.drawable.whatsnew2,"Inua Dada Foundation rolls out advocacy program",R.string.WhatsNew2));
        whatsNewModelList.add(new WhatsNewModel("JUNE 3, 2021",R.drawable.whatsnew3,"What Generation Equality means for a Kenyan",R.string.WhatsNew3));
        whatsNewModelList.add(new WhatsNewModel("OCTOBER 12, 2022",R.drawable.victimblaming,"What exactly is victim blaming? A deeper look into the phenomenon",R.string.WhatsNew1));
        whatsNewModelList.add(new WhatsNewModel("OCTOBER 23, 2022",R.drawable.whatsnew2,"Inua Dada Kibera",R.string.WhatsNew2));
        whatsNewModelList.add(new WhatsNewModel("NOVEMBER 3, 2022",R.drawable.whatsnew3,"Inua Dada Kibera",R.string.WhatsNew3));

        whatsNewAdapter = new WhatsNewAdapter(getActivity(), whatsNewModelList, this);
        whatsNewRec.setAdapter(whatsNewAdapter);
        whatsNewRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));
        whatsNewRec.setHasFixedSize(true);
        whatsNewRec.setNestedScrollingEnabled(false);
        layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        whatsNewRec.setLayoutManager(layoutManager);

        LinearSnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(whatsNewRec);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (layoutManager.findFirstCompletelyVisibleItemPosition() < (whatsNewAdapter.getItemCount() -1)){
                    layoutManager.smoothScrollToPosition(whatsNewRec,new RecyclerView.State(),layoutManager.findFirstCompletelyVisibleItemPosition() + 1);
                }else if (layoutManager.findFirstCompletelyVisibleItemPosition() == (whatsNewAdapter.getItemCount() -1 )){
                    layoutManager.smoothScrollToPosition(whatsNewRec,new RecyclerView.State(),0);
                }

            }
        },0,3000);

        /////////////////Programs////////////////////////////

        programsRec =root.findViewById(R.id.programs_recyclerview);
        programsModelList =new ArrayList<>();

        programsModelList.add(new ProgramsModel(R.drawable.whatsnew1,"Generation Equality Forum",R.string.Program1));
        programsModelList.add(new ProgramsModel(R.drawable.myfirsttime,"My First Time",R.string.Program2));
        programsModelList.add(new ProgramsModel(R.drawable.whatsnew1,"Media & Advocacy",R.string.Program3));
        programsModelList.add(new ProgramsModel(R.drawable.centresimage,"Centers",R.string.Program4));


        programsAdapter = new ProgramsAdapter(getActivity(), programsModelList, this);
        programsRec.setAdapter(programsAdapter);
        programsRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, false));
        programsRec.setHasFixedSize(true);
        programsRec.setNestedScrollingEnabled(false);

        return root;
    }
}