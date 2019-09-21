package tk.zielony.carbonsamples.widget;

import android.os.Bundle;

import tk.zielony.carbonsamples.ActivityAnnotation;
import tk.zielony.carbonsamples.R;
import tk.zielony.carbonsamples.Samples;
import tk.zielony.carbonsamples.SamplesActivity;

@ActivityAnnotation(layout = R.layout.activity_textfields, title = R.string.textFieldsActivity_title)
public class TextFieldsActivity extends SamplesActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Samples.initToolbar(this);
    }
}
