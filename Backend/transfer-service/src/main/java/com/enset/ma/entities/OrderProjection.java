package com.enset.ma.entities;

import com.enset.ma.enums.TransferStatus;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "fullOrder", types = Transfer.class)
public interface OrderProjection {
    Long getId();

    Date getCreatedAt();

    Long getCustomerId();

    TransferStatus getStatus();
}
