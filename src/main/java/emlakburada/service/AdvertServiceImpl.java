package emlakburada.service;

import emlakburada.dto.AdvertRequest;
import emlakburada.dto.response.AdvertResponse;

import java.util.List;

public interface AdvertServiceImpl {

    AdvertResponse create(AdvertRequest advertRequest);

    List<AdvertResponse> findAll();

    AdvertResponse update(Integer id, AdvertRequest advertRequest);

    Boolean delete(Integer id);
}
