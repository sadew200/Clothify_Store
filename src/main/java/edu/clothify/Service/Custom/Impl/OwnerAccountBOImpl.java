package edu.clothify.Service.Custom.Impl;

import Model.OwnerAccount;
import edu.clothify.Service.Custom.OwnerAccountBO;

public class OwnerAccountBOImpl implements OwnerAccountBO {
    @Override
    public boolean isOwner(OwnerAccount ownerAccount) {
        return false;
    }
}
