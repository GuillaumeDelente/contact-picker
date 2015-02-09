// Copyright 2013 Google Inc. All Rights Reserved.

package io.chub.android.contacts.common.extensions;

import android.content.Context;

import java.util.List;

import io.chub.android.contacts.common.list.DirectoryPartition;

/**
 * An interface for adding extended phone directories to
 * {@link io.chub.android.contacts.common.list.PhoneNumberListAdapter}.
 * An app that wishes to add custom phone directories should implement this class and advertise it
 * in assets/contacts_extensions.properties. {@link ExtensionsFactory} will load the implementation
 * and the extended directories will be added by
 * {@link io.chub.android.contacts.common.list.PhoneNumberListAdapter}.
 */
public interface ExtendedPhoneDirectoriesManager {

    /**
     * Return a list of extended directories to add. May return null if no directories are to be
     * added.
     */
    List<DirectoryPartition> getExtendedDirectories(Context context);
}
