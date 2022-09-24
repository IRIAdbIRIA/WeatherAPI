package net.atos.weatherapplication.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InputStringClass {
    @Id
    @Column(name = "textFieldId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String textField;
}
