package edu.aku.hassannaqvi.mapps_form2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionCcActivity extends Activity  {

    @BindView(R.id.activity_section_cc) RelativeLayout activitySectionCc;
    @BindView(R.id.scrollView01) ScrollView scrollView01;
    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.mp02cc001) EditText mp02cc001;
    @BindView(R.id.mp02cc002) RadioGroup mp02cc002;
    @BindView(R.id.mp02cc00201) RadioButton mp02cc00201;
    @BindView(R.id.mp02cc00202) RadioButton mp02cc00202;
    @BindView(R.id.mp02cc00203) RadioButton mp02cc00203;
    @BindView(R.id.mp02cc00204) RadioButton mp02cc00204;
    @BindView(R.id.mp02cc00205) RadioButton mp02cc00205;
    @BindView(R.id.mp02cc003) RadioGroup mp02cc003;
    @BindView(R.id.mp02cc00301) RadioButton mp02cc00301;
    @BindView(R.id.mp02cc00302) RadioButton mp02cc00302;
    @BindView(R.id.mp02cc00303) RadioButton mp02cc00303;
    @BindView(R.id.mp02cc00304) RadioButton mp02cc00304;
    @BindView(R.id.mp02cc004) RadioGroup mp02cc004;
    @BindView(R.id.mp02cc00401) RadioButton mp02cc00401;
    @BindView(R.id.mp02cc00402) RadioButton mp02cc00402;
    @BindView(R.id.mp02cc00403) RadioButton mp02cc00403;
    @BindView(R.id.mp02cc00404) RadioButton mp02cc00404;
    @BindView(R.id.mp02cc00405) RadioButton mp02cc00405;
    @BindView(R.id.mp02cc00406) RadioButton mp02cc00406;
    @BindView(R.id.mp02cc00407) RadioButton mp02cc00407;
    @BindView(R.id.mp02cc005) RadioGroup mp02cc005;
    @BindView(R.id.mp02cc00501) RadioButton mp02cc00501;
    @BindView(R.id.mp02cc00502) RadioButton mp02cc00502;
    @BindView(R.id.mp02cc00503) RadioButton mp02cc00503;
    @BindView(R.id.mp02cc00504) RadioButton mp02cc00504;
    @BindView(R.id.mp02cc00505) RadioButton mp02cc00505;
    @BindView(R.id.mp02cc00506) RadioButton mp02cc00506;
    @BindView(R.id.mp02cc006) RadioGroup mp02cc006;
    @BindView(R.id.mp02cc00601) RadioButton mp02cc00601;
    @BindView(R.id.mp02cc00602) RadioButton mp02cc00602;
    @BindView(R.id.mp02cc00603) RadioButton mp02cc00603;
    @BindView(R.id.mp02cc00604) RadioButton mp02cc00604;
    @BindView(R.id.mp02cc00605) RadioButton mp02cc00605;
    @BindView(R.id.mp02cc007) RadioGroup mp02cc007;
    @BindView(R.id.mp02cc00701) RadioButton mp02cc00701;
    @BindView(R.id.mp02cc00702) RadioButton mp02cc00702;
    @BindView(R.id.mp02cc00703) RadioButton mp02cc00703;
    @BindView(R.id.mp02cc00704) RadioButton mp02cc00704;
    @BindView(R.id.mp02cc00705) RadioButton mp02cc00705;
    @BindView(R.id.mp02cc008) RadioGroup mp02cc008;
    @BindView(R.id.mp02cc00801) RadioButton mp02cc00801;
    @BindView(R.id.mp02cc00802) RadioButton mp02cc00802;
    @BindView(R.id.mp02cc00803) RadioButton mp02cc00803;
    @BindView(R.id.mp02cc00804) RadioButton mp02cc00804;
    @BindView(R.id.mp02cc00805) RadioButton mp02cc00805;
    @BindView(R.id.mp02cc009) RadioGroup mp02cc009;
    @BindView(R.id.mp02cc00901) RadioButton mp02cc00901;
    @BindView(R.id.mp02cc00902) RadioButton mp02cc00902;
    @BindView(R.id.mp02cc00903) RadioButton mp02cc00903;
    @BindView(R.id.mp02cc00904) RadioButton mp02cc00904;
    @BindView(R.id.mp02cc00905) RadioButton mp02cc00905;
    @BindView(R.id.mp02cc010) RadioGroup mp02cc010;
    @BindView(R.id.mp02cc01001) RadioButton mp02cc01001;
    @BindView(R.id.mp02cc001002) RadioButton mp02cc001002;
    @BindView(R.id.mp02cc001003) RadioButton mp02cc001003;
    @BindView(R.id.mp02cc001004) RadioButton mp02cc001004;
    @BindView(R.id.mp02cc001005) RadioButton mp02cc001005;
    @BindView(R.id.mp02cc011) RadioGroup mp02cc011;
    @BindView(R.id.mp02cc01101) RadioButton mp02cc01101;
    @BindView(R.id.mp02cc01102) RadioButton mp02cc01102;
    @BindView(R.id.mp02cc01103) RadioButton mp02cc01103;
    @BindView(R.id.mp02cc01104) RadioButton mp02cc01104;
    @BindView(R.id.mp02cc01105) RadioButton mp02cc01105;
    @BindView(R.id.mp02cc012) RadioGroup mp02cc012;
    @BindView(R.id.mp02cc01201) RadioButton mp02cc01201;
    @BindView(R.id.mp02cc01202) RadioButton mp02cc01202;
    @BindView(R.id.mp02cc01203) RadioButton mp02cc01203;
    @BindView(R.id.mp02cc01204) RadioButton mp02cc01204;
    @BindView(R.id.mp02cc01205) RadioButton mp02cc01205;
    @BindView(R.id.mp02cc013) RadioGroup mp02cc013;
    @BindView(R.id.mp02cc01301) RadioButton mp02cc01301;
    @BindView(R.id.mp02cc01302) RadioButton mp02cc01302;
    @BindView(R.id.mp02cc01303) RadioButton mp02cc01303;
    @BindView(R.id.mp02cc01304) RadioButton mp02cc01304;
    @BindView(R.id.mp02cc01305) RadioButton mp02cc01305;
    @BindView(R.id.mp02cc014) RadioGroup mp02cc014;
    @BindView(R.id.mp02cc01401) RadioButton mp02cc01401;
    @BindView(R.id.mp02cc01402) RadioButton mp02cc01402;
    @BindView(R.id.mp02cc01403) RadioButton mp02cc01403;
    @BindView(R.id.mp02cc01404) RadioButton mp02cc01404;
    @BindView(R.id.mp02cc01405) RadioButton mp02cc01405;
    @BindView(R.id.mp02cc015) RadioGroup mp02cc015;
    @BindView(R.id.mp02cc01501) RadioButton mp02cc01501;
    @BindView(R.id.mp02cc01502) RadioButton mp02cc01502;
    @BindView(R.id.mp02cc01503) RadioButton mp02cc01503;
    @BindView(R.id.mp02cc01504) RadioButton mp02cc01504;
    @BindView(R.id.mp02cc01505) RadioButton mp02cc01505;
    @BindView(R.id.mp02cc016) RadioGroup mp02cc016;
    @BindView(R.id.mp02cc01601) RadioButton mp02cc01601;
    @BindView(R.id.mp02cc01602) RadioButton mp02cc01602;
    @BindView(R.id.mp02cc01603) RadioButton mp02cc01603;
    @BindView(R.id.mp02cc01604) RadioButton mp02cc01604;
    @BindView(R.id.mp02cc01605) RadioButton mp02cc01605;
    @BindView(R.id.mp02cc017) RadioGroup mp02cc017;
    @BindView(R.id.mp02cc01701) RadioButton mp02cc01701;
    @BindView(R.id.mp02cc01702) RadioButton mp02cc01702;
    @BindView(R.id.mp02cc01703) RadioButton mp02cc01703;
    @BindView(R.id.mp02cc01704) RadioButton mp02cc01704;
    @BindView(R.id.mp02cc01705) RadioButton mp02cc01705;
    @BindView(R.id.mp02cc018) RadioGroup mp02cc018;
    @BindView(R.id.mp02cc01801) RadioButton mp02cc01801;
    @BindView(R.id.mp02cc01802) RadioButton mp02cc01802;
    @BindView(R.id.mp02cc01803) RadioButton mp02cc01803;
    @BindView(R.id.mp02cc01804) RadioButton mp02cc01804;
    @BindView(R.id.mp02cc01805) RadioButton mp02cc01805;
    @BindView(R.id.mp02cc019) RadioGroup mp02cc019;
    @BindView(R.id.mp02cc01901) RadioButton mp02cc01901;
    @BindView(R.id.mp02cc01902) RadioButton mp02cc01902;
    @BindView(R.id.mp02cc01903) RadioButton mp02cc01903;
    @BindView(R.id.mp02cc01904) RadioButton mp02cc01904;
    @BindView(R.id.mp02cc01905) RadioButton mp02cc01905;
    @BindView(R.id.mp02cc020) RadioGroup mp02cc020;
    @BindView(R.id.mp02cc02001) RadioButton mp02cc02001;
    @BindView(R.id.mp02cc02002) RadioButton mp02cc02002;
    @BindView(R.id.mp02cc02003) RadioButton mp02cc02003;
    @BindView(R.id.mp02cc02004) RadioButton mp02cc02004;
    @BindView(R.id.mp02cc02005) RadioButton mp02cc02005;
    @BindView(R.id.mp02cc021) RadioGroup mp02cc021;
    @BindView(R.id.mp02cc02101) RadioButton mp02cc02101;
    @BindView(R.id.mp02cc02102) RadioButton mp02cc02102;
    @BindView(R.id.mp02cc02103) RadioButton mp02cc02103;
    @BindView(R.id.mp02cc02104) RadioButton mp02cc02104;
    @BindView(R.id.mp02cc02105) RadioButton mp02cc02105;
    @BindView(R.id.mp02cc022) RadioGroup mp02cc022;
    @BindView(R.id.mp02cc02201) RadioButton mp02cc02201;
    @BindView(R.id.mp02cc02202) RadioButton mp02cc02202;
    @BindView(R.id.mp02cc02203) RadioButton mp02cc02203;
    @BindView(R.id.mp02cc023) RadioGroup mp02cc023;
    @BindView(R.id.mp02cc02301) RadioButton mp02cc02301;
    @BindView(R.id.mp02cc02302) RadioButton mp02cc02302;
    @BindView(R.id.mp02cc02303) RadioButton mp02cc02303;
    @BindView(R.id.mp02cc02304) RadioButton mp02cc02304;
    @BindView(R.id.mp02cc024) RadioGroup mp02cc024;
    @BindView(R.id.mp02cc02401) RadioButton mp02cc02401;
    @BindView(R.id.mp02cc02402) RadioButton mp02cc02402;
    @BindView(R.id.mp02cc02403) RadioButton mp02cc02403;
    @BindView(R.id.mp02cc02404) RadioButton mp02cc02404;
    @BindView(R.id.mp02cc02405) RadioButton mp02cc02405;
    @BindView(R.id.mp02cc025) RadioGroup mp02cc025;
    @BindView(R.id.mp02cc02501) RadioButton mp02cc02501;
    @BindView(R.id.mp02cc02502) RadioButton mp02cc02502;
    @BindView(R.id.mp02cc02503) RadioButton mp02cc02503;
    @BindView(R.id.mp02cc02504) RadioButton mp02cc02504;
    @BindView(R.id.mp02cc02505) RadioButton mp02cc02505;
    @BindView(R.id.mp02cc026) RadioGroup mp02cc026;
    @BindView(R.id.mp02cc02601) RadioButton mp02cc02601;
    @BindView(R.id.mp02cc02602) RadioButton mp02cc02602;
    @BindView(R.id.mp02cc02603) RadioButton mp02cc02603;
    @BindView(R.id.mp02cc02604) RadioButton mp02cc02604;
    @BindView(R.id.mp02cc02605) RadioButton mp02cc02605;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_cc);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End) void onBtnEndClick() {
        Toast.makeText(this, "Complete Sections", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);

    }


    @OnClick(R.id.btn_Continue) void onBtnContinueClick() {
        Intent seccd = new Intent(this, SectionCDActivity.class);
        startActivity(seccd);

    }


}
