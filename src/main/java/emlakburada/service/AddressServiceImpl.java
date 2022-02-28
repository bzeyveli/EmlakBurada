package emlakburada.service;

import emlakburada.dto.AddressRequest;
import emlakburada.dto.AdvertRequest;
import emlakburada.dto.response.AddressResponse;
import emlakburada.dto.response.AdvertResponse;

import java.util.List;

public interface AddressServiceImpl {

    AddressResponse create(AddressRequest addressRequest);

    List<AddressResponse> findAll();

    AddressResponse update(Integer id, AddressRequest addressRequest);

    Boolean delete(Integer id);
}
