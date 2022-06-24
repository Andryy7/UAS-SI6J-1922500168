package ac.id.atmaluhur.mhs.uas_si6tj_1922500168;

import java.util.List;
import retrofit2.http.GET;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.QueryMap;

public interface LecturerJsonPlaceHolderAPI {
    @GET("lecturer.php")
    Call<List<LecturerPost>> getPosts(

    );
    @GET("lecturer.php")
    Call<List<LecturerPost>> getPosts(@QueryMap Map<String, String> parameters);
}