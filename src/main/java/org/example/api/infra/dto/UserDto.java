package org.example.api.infra.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.encrypt.RsaAlgorithm;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private int id;
    private String name;
    private String email;
    private String phone;
    private List<AddressDto> address;
    private RsaAlgorithm password;

}
