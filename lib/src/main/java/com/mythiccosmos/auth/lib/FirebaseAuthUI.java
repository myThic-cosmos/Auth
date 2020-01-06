package com.mythiccosmos.auth.lib;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.NonNull;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirebaseAuthUI {
    private static final int RC_SIGN_IN = 123;
    private Activity activity;
    private Context context;
    private List<AuthUI.IdpConfig> providers;

    public FirebaseAuthUI(Activity activity, Context context) {
        this.activity = activity;
        this.context = context;
        providers = new ArrayList<>();
    }


    public void setAuthProviderEMAIL(){
        providers.add(new AuthUI.IdpConfig.EmailBuilder().build());
    }

    public void setAuthProviderPHONE(){
        providers.add(new AuthUI.IdpConfig.PhoneBuilder().build());
    }
    public void setAuthProviderGOOGLE(){
        providers.add(new AuthUI.IdpConfig.GoogleBuilder().build());
    }
    public void setAuthProviderFACEBOOK(){
        providers.add(new AuthUI.IdpConfig.FacebookBuilder().build());
    }
    private void setAuthProviderGITHUB(){
        providers.add(new AuthUI.IdpConfig.GitHubBuilder().build());
    }
    private void setAuthProviderANONYMOUS(){
        providers.add(new AuthUI.IdpConfig.AnonymousBuilder().build());
    }
    public void setAuthProviderTWITTER(){
        providers.add(new AuthUI.IdpConfig.TwitterBuilder().build());
    }



    public void createSignInIntent() {
        activity.startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(providers)
                        .build(),
                RC_SIGN_IN);
    }

    public void signOut() {
        AuthUI.getInstance()
                .signOut(context)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    public void onComplete(@NonNull Task<Void> task) {

                    }
                });
    }

    private void delete() {
        // [START auth_fui_delete]
        AuthUI.getInstance()
                .delete(context)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        // ...
                    }
                });
        // [END auth_fui_delete]
    }

    public void themeAndLogo(int drawableId, int styleId) {
        List<AuthUI.IdpConfig> providers = Collections.emptyList();

        // [START auth_fui_theme_logo]
        activity.startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(providers)
                        .setLogo(drawableId)      // Set logo drawable
                        .setTheme(styleId)      // Set theme
                        .build(),
                RC_SIGN_IN);
        // [END auth_fui_theme_logo]
    }

    private void privacyAndTerms() {
        List<AuthUI.IdpConfig> providers = Collections.emptyList();
        // [START auth_fui_pp_tos]
        activity.startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(providers)
                        .setTosAndPrivacyPolicyUrls(
                                "https://example.com/terms.html",
                                "https://example.com/privacy.html")
                        .build(),
                RC_SIGN_IN);
        // [END auth_fui_pp_tos]
    }

    public FirebaseUser getProfile(){
        return FirebaseAuth.getInstance().getCurrentUser();
    }

    public boolean isAuthSuccess(){
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null){
            return true;
        }

        return false;
    }
}
