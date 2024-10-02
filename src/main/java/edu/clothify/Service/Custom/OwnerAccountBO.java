package edu.clothify.Service.Custom;

import Model.OwnerAccount;
import edu.clothify.Service.SuperBO;

public interface OwnerAccountBO extends SuperBO {
    boolean isOwner(OwnerAccount ownerAccount);
}
