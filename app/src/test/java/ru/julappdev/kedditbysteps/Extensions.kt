package ru.julappdev.kedditbysteps

import org.mockito.Mockito

/**
 * Created by yulia on 16.10.16.
 */

inline fun <reified T : Any> mock(): T = Mockito.mock(T::class.java)