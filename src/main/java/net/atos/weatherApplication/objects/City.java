package net.atos.weatherApplication.objects;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "city")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class City {

    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "city_name",nullable=false)
    private String cityName;
    @Column(name = "lat",nullable=false)
    private double lat;
    @Column(name = "lon",nullable=false)
    private double lon;
}
