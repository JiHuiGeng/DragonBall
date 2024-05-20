package com.cloudinary.dragonball.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @Author: gengjihui
 * @Date: 2024/5/16 17:31
 * @Description:
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {


  /**
   * 使用UserDetailsService,自定义用户,存于内存中
   * 如果需要存于数据库中,需要提供UserDetailsService的接口实现类,并注入到spring容器
   *
   * @return UserDetailsService
   * @date 2024/5/17 09:26
   * @author gengjihui
   */
//  UserDetailsService userDetailsService() {
//    InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
//    userDetailsManager.createUser(User.withUsername("root").password("{noop}123456").roles("admin").build());
//    return userDetailsManager;
//  }


  /**
   * 给公共资源放行,不用登陆即可访问
   *
   * @return WebSecurityCustomizer
   * @date 2024/5/17 09:25
   * @author gengjihui
   */
//  @Bean
//  WebSecurityCustomizer webSecurityCustomizer() {
//    //在spring security 5.8版本之后,antMatchers,mvcMatchers,regexMatchers弃用
//    return web -> web.ignoring().requestMatchers("/hello");
//  }
  @Bean
  protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    http
      //禁用basic明文认证
      .httpBasic(AbstractHttpConfigurer::disable)
      //前后端分离架构,不需要csrf保护
      .csrf(AbstractHttpConfigurer::disable)
      //禁用默认登陆页
//      .formLogin(AbstractHttpConfigurer::disable)
      //禁用默认登出页面
//      .logout(AbstractHttpConfigurer::disable)
      //设置异常的EntryPoint,如果不设置,默认使用的是http403ForbiddenEntryPoni
//      .exceptionHandling(exceptions -> exceptions.authenticationEntryPoint(invalidAuthenticationEntryPoint))
      //前后端分离是无状态的,不需要session了,直接禁用
      .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
      .authorizeHttpRequests(authorizeHttpRequest -> authorizeHttpRequest
        //允许所有的OPTIONS请求
        .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
        //允许所有的POST请求
        .requestMatchers(HttpMethod.POST, "/web/authenticate").permitAll()
        .requestMatchers(HttpMethod.GET, "/file/*").permitAll()
        //允许SpringMVC的默认错误地址匿名访问
        .requestMatchers("/error").permitAll()
        .anyRequest().authenticated());
//      .authenticationProvider(authenticationProvider);
    //此处添加自定义过滤器,替代UsernamePasswordAuthenticationFilter
//      .addFilterBefore();
    return http.build();
  }
}
