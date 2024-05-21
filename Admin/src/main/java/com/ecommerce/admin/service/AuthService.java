package com.ecommerce.admin.service;

import com.ecommerce.library.dto.AdminDto;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

public interface AuthService {
    String addNewAdmin(AdminDto adminDto, BindingResult result, Model model);
}
