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

        liveBlogModelList.add(new LiveBlogModel("Dummy header","10:20 ",R.drawable.jannett,"Dummy text"));
        liveBlogModelList.add(new LiveBlogModel("Dummy header","10:20 ",R.drawable.jannett,"Dummy text"));
        liveBlogModelList.add(new LiveBlogModel("Dummy header","10:20 ",R.drawable.jannett,"Dummy text"));



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