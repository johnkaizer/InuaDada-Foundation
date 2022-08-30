package com.project.inuadadafaundation.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.inuadadafaundation.Adapters.GalleryAdapter;
import com.project.inuadadafaundation.Adapters.ProgramsAdapter;
import com.project.inuadadafaundation.Models.GalleryModel;
import com.project.inuadadafaundation.R;
import com.project.inuadadafaundation.databinding.FragmentGalleryBinding;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    RecyclerView galleryRec;
    ArrayList<GalleryModel> galleryModelArrayList;
    GalleryAdapter galleryAdapter;

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel = new ViewModelProvider(this).get(GalleryViewModel.class);
        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        galleryRec = root.findViewById(R.id.gallery_rv);
        galleryModelArrayList = new ArrayList<>();

        galleryModelArrayList.add(new GalleryModel(R.drawable.janetmargaretkenyatta, "Janet Mbugua & Margaret Kenyata"));
        galleryModelArrayList.add(new GalleryModel(R.drawable.janet11, "Janet Mbugua "));
        galleryModelArrayList.add(new GalleryModel(R.drawable.zahranjoki, "Zahran Njoki"));
        galleryModelArrayList.add(new GalleryModel(R.drawable.zahramarura, "Zahra  & Marura"));
        galleryModelArrayList.add(new GalleryModel(R.drawable.leso, "Tandika Leso"));
        galleryModelArrayList.add(new GalleryModel(R.drawable.mwaniki, "Shiku Mwaniki"));
        galleryModelArrayList.add(new GalleryModel(R.drawable.janetmargaretkenyatta, "Janet Mbugua "));
        galleryModelArrayList.add(new GalleryModel(R.drawable.cynthiamutheujanet, "Cynthia Mutheu & Janet Mbugua"));
        galleryModelArrayList.add(new GalleryModel(R.drawable.dadasmargaretkenyatta, "Dadas With Margaret Kenyatta"));
        galleryModelArrayList.add(new GalleryModel(R.drawable.jannett, "Janet Mbugua"));


        galleryAdapter = new GalleryAdapter(getActivity(), galleryModelArrayList, this);
        galleryRec.setAdapter(galleryAdapter);
        galleryRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        galleryRec.setHasFixedSize(true);
        galleryRec.setNestedScrollingEnabled(false);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}