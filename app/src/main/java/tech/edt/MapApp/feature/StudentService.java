package tech.edt.MapApp.feature;

import android.graphics.Color;
import android.os.Parcel;

import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;

import tech.edt.MapApp.util.BitmapDescriptorWithID;
import tech.edt.MapApp.util.Util;

/**
 * Created by Murad on 11/1/17.
 * Extension of the Feature class, represents student services. Searchable.
 *
 */

public class StudentService extends Feature implements SearchSuggestion {
    private String address;
    private String phone;
    private String url;
    private String description;

    StudentService(LatLng ll, String name,
                   String address, String phone, String url, String description) {
        super(ll, name, true, true, Color.parseColor("#993399"));
        this.address = address;
        this.url = url;
        this.description = description;
        this.phone = phone;
    }


    public BitmapDescriptorWithID getBitmapDescriptor() {
        return Util.getStudentBMP();
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public String toShortString() {
        return getName();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String getSnippet() {
        return address;
    }


    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getDialogText() {
        return description + "\n" + phone + "\n" + url;
    }

    public String getPhone() {
        return phone;
    }
}
