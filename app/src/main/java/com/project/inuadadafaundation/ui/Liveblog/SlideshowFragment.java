package com.project.inuadadafaundation.ui.Liveblog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.inuadadafaundation.Adapters.LiveBlogAdapter;
import com.project.inuadadafaundation.Models.LiveBlogModel;
import com.project.inuadadafaundation.R;
import com.project.inuadadafaundation.databinding.FragmentHomeBinding;
import com.project.inuadadafaundation.databinding.FragmentLiveBlogBinding;

import java.util.ArrayList;


public class SlideshowFragment extends Fragment {

    RecyclerView liveRc;
    ArrayList<LiveBlogModel> liveBlogModelList;
    LiveBlogAdapter liveBlogAdapter;

    private FragmentLiveBlogBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_live_blog, container, false);

        liveRc =root.findViewById(R.id.liveBlog_rv);
        liveBlogModelList =new ArrayList<>();

        liveBlogModelList.add(new LiveBlogModel("A day with Dadas...","10:20 ",R.drawable.jannett,"I hold the firm belief that when everyone is included, everyone wins and this is the only way we can ensure that gender equity and economic empowerment programs continue being prioritized across the social and political spectrum."));
        liveBlogModelList.add(new LiveBlogModel("Her Excellency First Lady with Dadas","11:24 ",R.drawable.dadasmargaretkenyatta,"A movement that keeps growing because the world keeps believing in us and our story."));
        liveBlogModelList.add(new LiveBlogModel("Janet with Margaret Kenyatta","12:13 ",R.drawable.janetmargaretkenyatta,"I appreciate the importance of using my digital space not only to inspire people or share some insights into my life’s passions and activities, but also to bring key messaging and campaigns, particularly related to sexual and reproductive health and rights, cyber bullying and child safety, to life."));
        liveBlogModelList.add(new LiveBlogModel("Cynthia And Janet","20:15 ",R.drawable.janetmargaretkenyatta,"I appreciate the simple or share some insights  into my life’s passions and activities "));




        liveBlogAdapter = new LiveBlogAdapter(getActivity(), liveBlogModelList, this);
        liveRc.setAdapter(liveBlogAdapter);
        liveRc.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, false));
        liveRc.setHasFixedSize(true);
        liveRc.setNestedScrollingEnabled(false);

        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}