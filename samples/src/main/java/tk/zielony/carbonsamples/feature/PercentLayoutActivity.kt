package tk.zielony.carbonsamples.feature

import android.os.Bundle
import tk.zielony.carbonsamples.ActivityAnnotation

import tk.zielony.carbonsamples.R
import tk.zielony.carbonsamples.Samples
import tk.zielony.carbonsamples.SamplesActivity

@ActivityAnnotation(layout = R.layout.activity_percentlayout, title = R.string.percentLayoutActivity_title)
class PercentLayoutActivity : SamplesActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Samples.initToolbar(this)
    }
}
