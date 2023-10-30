package com.enset.ma.entities;

import com.enset.ma.enums.TransferStatus;
import com.enset.ma.model.Wallet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "transfers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Date date;
    @Transient
    private Wallet walletSource;
    @Transient
    private Wallet walletDestination;
    private double montant;
    private TransferStatus status;
}
