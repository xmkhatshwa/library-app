import React, { ReactNode } from 'react';
import { Redirect } from 'react-router-dom';
import { useOktaAuth } from '@okta/okta-react';
import OktaSignInWidget from './OktaSignInWidget';
import { Spinner } from '../Utils/Spinner';
import { Tokens } from '@okta/okta-auth-js';

const LoginWidget: React.FC<any> = ({ config }) => {
    const { oktaAuth, authState } = useOktaAuth();
    const onSuccess = (tokens: Tokens | undefined) => {
        oktaAuth.handleLoginRedirect(tokens);
    };

    const onError = (err: any) => {
        console.log('Sign in error: ', err);
    }

    if (!authState) {
        return (
            <Spinner/>
        );
    }

    return authState.isAuthenticated ?
    <Redirect to={{ pathname: '/' }}/>
    :
    <OktaSignInWidget config={config} onSuccess={onSuccess} onError={onError}/>;
};

export default LoginWidget;