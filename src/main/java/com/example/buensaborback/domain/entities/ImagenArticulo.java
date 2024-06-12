package com.example.buensaborback.domain.entities;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
public class ImagenArticulo extends Base{

    private String name;
    private String url;

}
