import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetWeatherAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        String url="https://api.weatherbit.io/v2.0/current?lat=21.170240&lon=72.831062&key=6484619997f24c2e90531f9dbf5597cb&include=minutely";


        HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        HttpClient httpClient=HttpClient.newBuilder().build();

        HttpResponse<String> httpResponse=httpClient.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.body());
    }
}
