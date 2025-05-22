export const oktaConfig = {
    clientId: '0oaousvhvr3JF4ysV5d7',
    issuer: 'https://dev-36794805.okta.com/oauth2/default',
    redirectUri: 'http://localhost:3000/login/callback',
    scopes: ['openid', 'profile', 'email'],
    pkce: true,
    disableHttpsCheck: true,
}