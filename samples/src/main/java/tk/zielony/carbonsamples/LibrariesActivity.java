package tk.zielony.carbonsamples;

import android.os.Bundle;

import java.io.Serializable;

import carbon.component.PaddingItem;
import tk.zielony.carbonsamples.library.ConstraintLayoutActivity;
import tk.zielony.carbonsamples.library.DesignActivity;
import tk.zielony.carbonsamples.library.PicassoActivity;
import tk.zielony.carbonsamples.library.RecyclerCardsActivity;

@ActivityAnnotation(title = R.string.librariesActivity_title)
public class LibrariesActivity extends SampleListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Samples.initToolbar(this);

        setItems(new Serializable[]{
                new PaddingItem(getResources().getDimensionPixelSize(R.dimen.carbon_paddingHalf)),
                "The most popular libraries used with Carbon",
                new SampleActivityItem(PicassoActivity.class),
                new SampleActivityItem(RecyclerCardsActivity.class),
                new SampleActivityItem(DesignActivity.class),
                new SampleActivityItem(ConstraintLayoutActivity.class),
                new PaddingItem(getResources().getDimensionPixelSize(R.dimen.carbon_paddingHalf))
        });
    }

}
