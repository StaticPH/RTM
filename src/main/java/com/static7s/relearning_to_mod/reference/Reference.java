package com.static7s.relearning_to_mod.reference;

public class Reference {
//you can store common constants for your mod here

//you can use the Reference classes to avoid having to write the actual values for things which are used many times.
//Instead, you can just reference a variable stored in Reference which contains the actual value.
//It also means that if you want to change the value, you only need to change it in the Reference and it will push the
//change to the rest of the mod
    public static final String MOD_ID = "relearning_to_mod";
    public static final String MOD_NAME ="RTM";//was "Relearning to mod"
    public static final String FINGERPRINT ="@FINGERPRINT@  ";
    public static final String VERSION ="1.7.2 - 1.0";
    public static final String SERVER_PROXY_CLASS = "com.static7s.relearning_to_mod.proxy.ServerProxy";
    public static final String CLIENT_PROXY_CLASS = "com.static7s.relearning_to_mod.proxy.ClientProxy";
}
