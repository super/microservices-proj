package com.keltenfalez.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Customer details")
public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer_id_sequence",
            sequenceName = "customer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"
    )
    @ApiModelProperty(notes = "The unique id of the customer")
    private Integer id;

    @ApiModelProperty(notes = "The customer's first name")
    private String firstName;

    @ApiModelProperty(notes = "The customer's last name")
    private String lastName;

    @ApiModelProperty(notes = "The customer's email")
    private String email;
}
